package app.utils;

import app.Clothes.Clothes;
import app.Clothes.Color;
import app.Clothes.PRODUCER;
import app.Clothes.Type;

public record Production(Position position, String name, Type type, Color color,
                         PRODUCER producer, Clothes clothes) {
    private Production(Builder builder) {
        this(builder.position,builder.name,builder.type,builder.color,builder.producer,builder.clothes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is ")
                .append(name)
                .append(" in position ")
                .append(position);
        if (color != null || type != null) {
            sb.append(" with ");
            if (color != null) {
                sb.append(color).append(' ');
            }
            if (type != null) {
                sb.append(type).append(' ');
            }
            sb.append(type != Type.COTTON ? "cloth" : "woof");
        }
        if (producer != null) {
            sb.append(" has ").append(producer).append(" producer");
        }
        if (clothes != null) {
            sb.append(" and wears with ").append(clothes);
        }
        sb.append('.');
        return sb.toString();
    }
    public static class Builder {

       private final Position position;
       private final String name;
       private Type type;
       private Color color;
       private PRODUCER producer;
       private Clothes clothes;

        public Builder(Position position, String name) {
            if ( position == null || name == null ){
                throw new IllegalArgumentException("position and name " +
                        "can not be null");
            }
            this.position = position;
            this.name = name;
        }
        public Builder withType(Type Type) {
            this.type = type;
            return this;
        }

        public Builder withColor(Color Color) {
            this.color = color;
            return this;
        }

        public Builder withProducer(PRODUCER producer) {
            this.producer = producer;
            return this;
        }
        public Builder withClothes(Clothes clothes) {
            this.clothes = clothes;
            return this;
        }
        public Production build() {
            return new Production(this);
        }
    }
}
