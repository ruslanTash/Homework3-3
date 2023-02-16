package Transport;

enum Body {
    SEDAN ("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String bodyType;

    Body(String bodyType) {
        this.bodyType = bodyType;
    }


    @Override
    public String toString() {
        return "Тип кузова: " + bodyType;
    }
}
