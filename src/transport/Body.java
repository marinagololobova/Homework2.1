package transport;

public enum Body {
    SEDAN("седан"),
    HATCHBACK("хетчбек"),
    COUPE("купе"),
    WAGONBODY("универсал"),
    JEEP("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивен");
    private String translation;

    Body(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }


    @Override
    public String toString() {
        return "Тип кузова: " + translation;
    }
}
