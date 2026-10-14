package n1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f33608d;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f33607c = str;
        this.f33608d = objArr;
    }

    @Override // n1.f
    public void a(e eVar) {
        double dFloatValue;
        long jLongValue;
        int iIntValue;
        Object[] objArr = this.f33608d;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            if (obj == null) {
                ((o1.e) eVar).f33885c.bindNull(i10);
            } else if (obj instanceof byte[]) {
                ((o1.e) eVar).f33885c.bindBlob(i10, (byte[]) obj);
            } else {
                if (obj instanceof Float) {
                    dFloatValue = ((Float) obj).floatValue();
                } else if (obj instanceof Double) {
                    dFloatValue = ((Double) obj).doubleValue();
                } else {
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else if (obj instanceof Short) {
                            iIntValue = ((Short) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            iIntValue = ((Byte) obj).byteValue();
                        } else if (obj instanceof String) {
                            ((o1.e) eVar).f33885c.bindString(i10, (String) obj);
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                            }
                            jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        jLongValue = iIntValue;
                    }
                    ((o1.e) eVar).f33885c.bindLong(i10, jLongValue);
                }
                ((o1.e) eVar).f33885c.bindDouble(i10, dFloatValue);
            }
        }
    }

    @Override // n1.f
    public String b() {
        return this.f33607c;
    }
}
