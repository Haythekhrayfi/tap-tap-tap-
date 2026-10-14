package d4;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    BackEaseIn(e4.a.class),
    BackEaseOut(e4.c.class),
    BackEaseInOut(e4.b.class),
    BounceEaseIn(f4.a.class),
    BounceEaseOut(f4.c.class),
    BounceEaseInOut(f4.b.class),
    CircEaseIn(g4.a.class),
    CircEaseOut(g4.c.class),
    CircEaseInOut(g4.b.class),
    CubicEaseIn(h4.a.class),
    CubicEaseOut(h4.c.class),
    CubicEaseInOut(h4.b.class),
    ElasticEaseIn(i4.a.class),
    ElasticEaseOut(i4.b.class),
    ExpoEaseIn(j4.a.class),
    ExpoEaseOut(j4.c.class),
    ExpoEaseInOut(j4.b.class),
    QuadEaseIn(l4.a.class),
    QuadEaseOut(l4.c.class),
    QuadEaseInOut(l4.b.class),
    QuintEaseIn(m4.a.class),
    QuintEaseOut(m4.c.class),
    QuintEaseInOut(m4.b.class),
    SineEaseIn(n4.a.class),
    SineEaseOut(n4.c.class),
    SineEaseInOut(n4.b.class),
    Linear(k4.a.class);

    private Class easingMethod;

    c(Class cls) {
        this.easingMethod = cls;
    }

    public a getMethod(float f10) {
        try {
            return (a) this.easingMethod.getConstructor(Float.TYPE).newInstance(Float.valueOf(f10));
        } catch (Exception e10) {
            e10.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
