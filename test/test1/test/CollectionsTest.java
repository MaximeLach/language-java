/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import java.util.HashSet;
import org.junit.Test;


/**
 *
 * @author admin
 */
public class CollectionsTest {
    
    
    @Test
    public void test1Map(){
        HashMap<String,String> map = new HashMap<>();
        map.put("java", "Langage de programmation objet");
        map.put("c", "Langage de programmation structuré");
        map.put("ruby", "Langage de programmation de script objet");    
        
        
        HashMap<String,String> mapAjout = new HashMap<>();
        mapAjout.put("PHP", "Langage PHP blabla");
        mapAjout.put("Python", "Langage Python blabla");
        
        map.putAll(mapAjout);
        
        System.out.println("testMap : " + map);
        
        for(String cle : map.keySet()){
            System.out.println(cle + " " + map.get(cle));
        }
    }
    
   
    public void supprimeLangageC(){
        HashMap<String,String> map = new HashMap<>();
        map.put("java", "Langage de programmation objet");
        map.put("c", "Langage de programmation structuré");
        map.put("ruby", "Langage de programmation de script objet");    
        map.remove("c");
        System.out.println("supprimeLangageC : "+map.get("c"));
    }
    
   
    public void remplceDefRubyParSuperLangage(){
        HashMap<String,String> map = new HashMap<>();
        map.put("java", "Langage de programmation objet");
        map.put("c", "Langage de programmation structuré");
        map.put("ruby", "Langage de programmation de script objet");    
        map.replace("ruby", "Super langage");
        System.out.println("remplceDefRubyParSuperLangage : " + map.get("ruby"));
    }
    
   
    public void recupRuby(){
        HashMap<String,String> map = new HashMap<>();
        map.put("java", "Langage de programmation objet");
        map.put("c", "Langage de programmation structuré");
        map.put("ruby", "Langage de programmation de script objet");    
        System.out.println("recupRuby : " + map.get("ruby"));
    }
    
   
    public void map(){
        HashMap<String,String> map = new HashMap<>();
        map.put("java", "Langage de programmation objet");
        map.put("c", "Langage de programmation structuré");
        map.put("ruby", "Langage de programmation de script objet");
    
        map.size();
        map.get("ruby");
        map.keySet(); //renvoie un set avec java, c, ruby
        map.values();
        map.putAll(map); //ajoute une map dans une autre
        map.remove("c");
        map.replace("c", "langage préhistorique");
        map.clear();
    }
    
}
