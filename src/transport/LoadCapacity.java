package transport;

public enum LoadCapacity {
    N1(null, 3.5f),
    N2(3.6f,12f),
    N3(13f, null);
    private Float lowerBound;
    private Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Float getLowerBound() {
        return lowerBound;
    }

    public Float getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Грузоподъемность: до " + upperBound + " тонн";
        } if (upperBound == null) {
            return "Грузоподъемность: от " + lowerBound + " тонн";
        } else {
            return "Грузоподьемность: от " + lowerBound + " тонн до " + upperBound + " тонн.";
        }
    }
}
