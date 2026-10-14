package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1152a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1153b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f1154c = new Rect();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f1155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f1156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f1157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Field f1158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Field f1159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Field f1160f;

        /* JADX WARN: Code duplicated, block: B:25:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0058  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            boolean z10;
            Field field4;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                z10 = false;
                                field4 = null;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        z10 = false;
                        field4 = null;
                        if (z10) {
                            f1156b = method;
                            f1157c = field;
                            f1158d = field2;
                            f1159e = field3;
                            f1160f = field4;
                            f1155a = true;
                            return;
                        }
                        f1156b = null;
                        f1157c = null;
                        f1158d = null;
                        f1159e = null;
                        f1160f = null;
                        f1155a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        z10 = false;
                        field4 = null;
                        if (z10) {
                            f1156b = method;
                            f1157c = field;
                            f1158d = field2;
                            f1159e = field3;
                            f1160f = field4;
                            f1155a = true;
                            return;
                        }
                        f1156b = null;
                        f1157c = null;
                        f1158d = null;
                        f1159e = null;
                        f1160f = null;
                        f1155a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        z10 = false;
                        field4 = null;
                        if (z10) {
                            f1156b = method;
                            f1157c = field;
                            f1158d = field2;
                            f1159e = field3;
                            f1160f = field4;
                            f1155a = true;
                            return;
                        }
                        f1156b = null;
                        f1157c = null;
                        f1158d = null;
                        f1159e = null;
                        f1160f = null;
                        f1155a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    z10 = false;
                    field4 = null;
                    if (z10) {
                        f1156b = method;
                        f1157c = field;
                        f1158d = field2;
                        f1159e = field3;
                        f1160f = field4;
                        f1155a = true;
                        return;
                    }
                    f1156b = null;
                    f1157c = null;
                    f1158d = null;
                    f1159e = null;
                    f1160f = null;
                    f1155a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    z10 = false;
                    field4 = null;
                    if (z10) {
                        f1156b = method;
                        f1157c = field;
                        f1158d = field2;
                        f1159e = field3;
                        f1160f = field4;
                        f1155a = true;
                        return;
                    }
                    f1156b = null;
                    f1157c = null;
                    f1158d = null;
                    f1159e = null;
                    f1160f = null;
                    f1155a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    z10 = false;
                    field4 = null;
                    if (z10) {
                        f1156b = method;
                        f1157c = field;
                        f1158d = field2;
                        f1159e = field3;
                        f1160f = field4;
                        f1155a = true;
                        return;
                    }
                    f1156b = null;
                    f1157c = null;
                    f1158d = null;
                    f1159e = null;
                    f1160f = null;
                    f1155a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f1156b = method;
                f1157c = field;
                f1158d = field2;
                f1159e = field3;
                f1160f = field4;
                f1155a = true;
                return;
            }
            f1156b = null;
            f1157c = null;
            f1158d = null;
            f1159e = null;
            f1160f = null;
            f1155a = false;
        }
    }

    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        b(drawable);
    }

    public static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1152a);
        } else {
            drawable.setState(f1153b);
        }
        drawable.setState(state);
    }

    public static Rect c(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = b.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableA = androidx.core.graphics.drawable.a.a(drawable);
        boolean z10 = a.f1155a;
        if (i10 < 29 && a.f1155a) {
            try {
                Object objInvoke = a.f1156b.invoke(drawableA, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(a.f1157c.getInt(objInvoke), a.f1158d.getInt(objInvoke), a.f1159e.getInt(objInvoke), a.f1160f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1154c;
    }

    public static PorterDuff.Mode d(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
