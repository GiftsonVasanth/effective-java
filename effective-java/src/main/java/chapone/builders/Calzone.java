package chapone.builders;

public class Calzone extends Pizza {

    private boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside;

        public Builder sauceInside(boolean sauceInside) {
            this.sauceInside = sauceInside;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        Builder self() {
            return this;
        }
    }


    public Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
