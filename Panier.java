import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier
	
    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        if(fruits.size() == contenanceMax){
            fruits = new ArrayList<Fruit>();  
        }
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String s = new String() ; 
        for(int i = 0 ; i < fruits.size() ; ++i){
            s+=fruits.get(i).getClass().getName();  
        }
        return s ;
    }
    
    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
      this.fruits = fruits ; 
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }
    
    public int getContenanceMax(){  //accesseur du second attribut
	return this.contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	    return this.fruits.get(i);
    }
    
    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        this.fruits.set(i, f) ; 
    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
        if(this.fruits.isEmpty())
            return true ; 
	    return false;
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
        if(this.fruits.size() == contenanceMax)
            return true; 
	    return false;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
       this.fruits.add(o) ; 
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
     this.fruits.remove(contenanceMax - 1) ; 
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans 
        double sum = 0; 
        for(int i = 0 ; i < this.fruits.size(); ++i){
            sum += this.fruits.get(i).getPrix() ; 
        }
	return 0;
    }
    
    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
        for(int i = 0 ; i < this.fruits.size() ; ++i){
            if(this.fruits.get(i).getOrigine().equals(origine))
                this.fruits.remove(i) ; 
        }
    }  
        
    //groupe 8    
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        for(int i = 0 ; i < this.fruits.size() ; ++i){
            if(!this.fruits.get(i).equals(o)) 
                return false ; 
        }
        return true ; 
    }
    
    //tests
    public static void main (String[] args){
    	//Ecrire ici vos tests
	System.out.println("premier test Panier");
    }
}
