package ma.enset.javaavnce.metier;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{
    private List<Produit> listProduits =new ArrayList<>();
    @Override
    public void add(Produit o) {
          listProduits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return listProduits;
    }


    @Override
    public Produit findById(long id)  {
//        Produit p = new Produit();
        for (Produit oo: this.getAll()) {
            if (oo.getId()==id) {
                return oo;
            }
        }

        return null;
    }


    @Override
    public void delete(long id) {
        for (Produit p:listProduits) {
            if (p.getId() == id) {
                listProduits.remove(p);
                break;
            }else {System.out.println("Product not existe");}
        }
    }


}
