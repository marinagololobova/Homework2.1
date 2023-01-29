package transport;

public enum Capacity {
    VERYSMALL(null, 10),
    SMALL(11, 25),
    AVERAGE(26, 50),
    BIG(51, 80),
    VERYBIG(81,120);
    private Integer lowerBound;
    private Integer upperBound;

    Capacity(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Вместимость: до " + upperBound + " мест";
        } if (upperBound == null) {
            return "Вместимость: от " + lowerBound + " мест";
        } else {
            return "Вместимость: от " + lowerBound + " мест до " + upperBound + " мест.";
        }
    }
}
