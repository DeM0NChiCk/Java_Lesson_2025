package solid.dependency_inversion;

import solid.dependency_inversion.like.DebitSBP;
import solid.dependency_inversion.like.MiraCard;
import solid.dependency_inversion.like.UnionCard;

public class Main {
    public static void main(String[] args) {
        Store storeOnlyCard = new Store();

        storeOnlyCard.purchase(10);
        storeOnlyCard.purchase(10);
        storeOnlyCard.purchase(10);
        storeOnlyCard.purchase(10);
        storeOnlyCard.purchase(10);

        Store storeSBPandCard;

        //like

        solid.dependency_inversion.like.Store store;
        store = new solid.dependency_inversion.like.Store(new UnionCard());
        solid.dependency_inversion.like.Store store2;
        store2 = new solid.dependency_inversion.like.Store(new UnionCard());

        store.purchase(10);
        store.purchase(20);
        store.purchase(20);
        store.purchase(20);
        store.purchase(20);

        System.out.println(store.toString());
        System.out.println(store2.toString());
    }
}
