package org.starrier.sky.ladder.basic.lists;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author starrier
 * @date 2020/12/2
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;

    private Integer age;

    @Override
    public boolean equals(Object obj){
        if(this ==  obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        if(age != other.age){
            return false;
        }
        if(name == null){
            if(other.name != null){
                return false;
            }
        }else if(!name.equals(other.name)){
            return false;
        }
        return true;
    }

}
