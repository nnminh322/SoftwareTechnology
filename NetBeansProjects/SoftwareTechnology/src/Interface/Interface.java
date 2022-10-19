/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import java.util.List;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public interface Interface<T> {
    
    public List<Citizen> show();
    public int insert(T t);
    public int update(T t);
    public int delete(T t);
    public int search(T t);
    
   
    
}
