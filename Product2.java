public public class Product2 {
    protected int mProductId;
    protected int mManufactureId;
    protected float mWholeSalePrice;
    protected float mMarkup;

    public Product(){
        mProductId = 12345;
        mManufactureId = 0123;
        mWholeSalePrice = 25.99f;
        mMarkup = 0.05f;
    }
    public Product(int productId, int manufactureId, float wholeSalePrice, float markup){
        mProductId = productId;
        mManufactureId = manufactureId;
        mWholeSalePrice = wholeSalePrice;
        mMarkup = markup;
    }
}
 Main {
    
}
