package creational.builder;

public final class DeliveryV2 {
    private String name;
    private String address;
    private String phone;
    private String additional1;
    private String additional2;
    private String additional3;

    private DeliveryV2() {
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
        private DeliveryV2 delivery = new DeliveryV2();

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
            delivery.name = name;
            delivery.address = address;
            delivery.phone = phone;
        }

        public DeliveryV2 additional1(String additional1) {
            delivery.additional1 = additional1;
            return delivery;
        }

        public DeliveryV2 additional2(String additional2) {
            delivery.additional2 = additional2;
            return delivery;
        }

        public DeliveryV2 additional3(String additional3) {
            delivery.additional3 = additional3;
            return delivery;
        }

        public DeliveryV2 build() {
            return delivery;
        }
    }
}