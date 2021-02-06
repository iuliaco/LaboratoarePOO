public class ProductFactory {
        public Product factory(String type, String nameProduct, float productPrice) {
            if(type == null || type.isEmpty())
                return null;
            else if("Food".equals(type)) {
                return new Food(productPrice, nameProduct);
            } else if("Computer".equals(type)) {
                return new Computer(productPrice, nameProduct);
            } else if("Book".equals(type)) {
                return new Book(productPrice, nameProduct);
            } else if("Beverage".equals(type)) {
                return new Beverage(productPrice, nameProduct);
            }
            return null;
        }

}
