package f5;

/* JADX INFO: loaded from: classes2.dex */
public enum e0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f29263id;

    e0(int i10) {
        this.f29263id = i10;
    }

    public static e0 determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f29263id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f29263id);
    }
}
