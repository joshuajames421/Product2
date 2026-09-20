public class Apparel extends Product2 {
    private String mName;
    private float mDiscountPercentage;


      public Apparel() {
        super();
        mName = "Default";
        mDiscountPercentage = 0.0f;
        mProductId = 12345;
        mManufactureId = 0123;
        mWholeSalePrice = 25.99f;
        mMarkup = .30f;
    }
     public Apparel(String name, float discountPercentage, int productId, int manufactureId, float wholeSalePrice, float markup) {
        super(productId, manufactureId, wholeSalePrice, markup);
        mName = name;
        mDiscountPercentage = discountPercentage;
        mProductId = productId;
        mManufactureId = manufactureId;
        mWholeSalePrice = wholeSalePrice;
        mMarkup = markup;
    }
        public void setApparel(String name, float discountPercentage, int productId, int manufactureId, float wholeSalePrice, float markup) {
        mName = name;
        mDiscountPercentage = discountPercentage;
        mProductId = productId;
        mManufactureId = manufactureId;
        mWholeSalePrice = wholeSalePrice;
        mMarkup = markup;
    }
    public float SalePrice() {
        return super.RetailPrice() - (super.RetailPrice() * mDiscountPercentage);
    }
   @Override
    public String toString() {
        return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %s\n%s: %.2f", 
            "Product ID", mProductId, 
            "Manufacture ID", mManufactureId,
            "Wholesale Price", mWholeSalePrice,
            "Markup", mMarkup,
            "Total Price", SalePrice(),
            "Name", mName,
            "Discount Percentage", mDiscountPercentage);
    }
        @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Apparel) {
            Apparel other = (Apparel) obj;
            return this.mProductId == other.mProductId &&
                   this.mManufactureId == other.mManufactureId &&
                   this.mWholeSalePrice == other.mWholeSalePrice &&
                   this.mMarkup == other.mMarkup &&
                   this.mName.equals(other.mName) &&
                   this.mDiscountPercentage == other.mDiscountPercentage;
        }
        return false;
    }
}