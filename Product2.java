public class Product2 {
    protected int mProductId;
    protected int mManufactureId;
    protected float mWholeSalePrice;
    protected float mMarkup;

    public Product2(){
        mProductId = 12345;
        mManufactureId = 0123;
        mWholeSalePrice = 25.99f;
        mMarkup = .30f;
    }
    public Product2(int productId, int manufactureId, float wholeSalePrice, float markup){
        mProductId = productId;
        mManufactureId = manufactureId;
        mWholeSalePrice = wholeSalePrice;
        mMarkup = markup;
    }
    public int getProductId() {
        return mProductId;
    }
    public int getManufactureId() {
        return mManufactureId;
    }
    public float getWholeSalePrice() {
        return mWholeSalePrice;
    }
    public float getMarkup() {
        return mMarkup;
    }
    

}
    