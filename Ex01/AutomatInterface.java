package Ex01;

import java.util.List;

public class AutomatInterface implements Service<Automat, Product>{

    @Override
    public Automat restock(Automat automat, Product product) {
        Product addProduct = automat.getProduct(product.getName());
    List<Product> listProducts = automat.getListProduct();
    if (addProduct != null) {
      addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
    } else {
      listProducts.add(product);
    }
    automat.initProducts(listProducts);
    return automat;
    }
    
}
