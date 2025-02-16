package creational.builder;

public final class Delivery {
    private final String name;
    private final String address;
    private final String phone;
    private final String additional1;
    private final String additional2;
    private final String additional3;

    private Delivery(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.phone = builder.phone;
        this.additional1 = builder.additional1;
        this.additional2 = builder.additional2;
        this.additional3 = builder.additional3;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", additional1='" + additional1 + '\'' +
                ", additional2='" + additional2 + '\'' +
                ", additional3='" + additional3 + '\'' +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String address;
        private final String phone;
        private String additional1;
        private String additional2;
        private String additional3;

        public Builder(String name, String address, String phone) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            if (address == null || address.isEmpty()) {
                throw new IllegalArgumentException("Address cannot be null or empty");
            }
            if (phone == null || phone.isEmpty()) {
                throw new IllegalArgumentException("Phone cannot be null or empty");
            }
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public Builder additional1(String additional1) {
            this.additional1 = additional1;
            return this;
        }

        public Builder additional2(String additional2) {
            this.additional2 = additional2;
            return this;
        }

        public Builder additional3(String additional3) {
            this.additional3 = additional3;
            return this;
        }

        public Delivery build() {
            return new Delivery(this);
        }
    }
}