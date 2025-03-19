package creational.builder.examples.delivery;

public final class DeliveryIncorrectVersion {
    private String name;
    private String address;
    private String phone;
    private String additional1;
    private String additional2;
    private String additional3;

    private DeliveryIncorrectVersion() {
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
        private DeliveryIncorrectVersion delivery = new DeliveryIncorrectVersion();

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

        public DeliveryIncorrectVersion additional1(String additional1) {
            delivery.additional1 = additional1;
            return delivery;
        }

        public DeliveryIncorrectVersion additional2(String additional2) {
            delivery.additional2 = additional2;
            return delivery;
        }

        public DeliveryIncorrectVersion additional3(String additional3) {
            delivery.additional3 = additional3;
            return delivery;
        }

        public DeliveryIncorrectVersion build() {
            return delivery;
        }
    }
}