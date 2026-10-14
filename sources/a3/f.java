package a3;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);

    private final float multiplier;

    f(float f10) {
        this.multiplier = f10;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
