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
    public void setProduct(int productId) {
        mProductId = productId;
    } 
    public void setManufactureId(int manufactureId) {
        mManufactureId = manufactureId;
    }
    public void setWholeSalePrice(float wholeSalePrice) {
        mWholeSalePrice = wholeSalePrice;
    }
    public void setMarkup(float markup) {
        mMarkup = markup;
    }
    public float RetailPrice(){
        return mWholeSalePrice + (mWholeSalePrice * mMarkup);
    }
    public boolean LessThan(Product2 other){
        return this.mProductId < other.mProductId;
    }
    @Override 
    public String toString(){
        return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
            "Product ID", mProductId, 
            "Manufacture ID", mManufactureId, 
            "Wholesale Price", mWholeSalePrice, 
            "Markup", mMarkup, 
            "Retail Price", RetailPrice());
    }
    public Product2 getClone(){
        Product2 clone = new Product2(this.mProductId, this.mManufactureId, this.mWholeSalePrice, this.mMarkup);
        return clone;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Product2) {
            Product2 other = (Product2) obj;
            return this.mProductId == other.mProductId &&
                   this.mManufactureId == other.mManufactureId &&
                   this.mWholeSalePrice == other.mWholeSalePrice &&
                   this.mMarkup == other.mMarkup;
        }
        return false;
    }

}
    