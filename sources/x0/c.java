package x0;

import android.util.FloatProperty;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> {
    public final String mPropertyName;

    public static class a extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f37362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f37362a = floatProperty;
        }

        @Override // x0.c
        public float getValue(T t10) {
            return ((Float) this.f37362a.get(t10)).floatValue();
        }

        @Override // x0.c
        public void setValue(T t10, float f10) {
            this.f37362a.setValue(t10, f10);
        }
    }

    public c(String str) {
        this.mPropertyName = str;
    }

    public static <T> c<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t10);

    public abstract void setValue(T t10, float f10);
}
