package u0;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public interface a<T> {
    }

    /* JADX INFO: renamed from: u0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0422b<T, V> {
    }

    public static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f35917c = new Rect();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f35918d = new Rect();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f35919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a<T> f35920f;

        public c(boolean z10, a<T> aVar) {
            this.f35919e = z10;
            this.f35920f = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            Rect rect = this.f35917c;
            Rect rect2 = this.f35918d;
            ((u0.a.C0421a) this.f35920f).a(t10, rect);
            ((u0.a.C0421a) this.f35920f).a(t11, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f35919e ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f35919e ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f35919e ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f35919e ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    public static boolean a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean z10;
        int i11;
        int i12;
        boolean zB = b(i10, rect, rect2);
        if (b(i10, rect, rect3) || !zB) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (rect.right <= rect3.left) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (rect.top >= rect3.bottom) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (rect.left >= rect3.right) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i10 == 17 || i10 == 66) {
            return true;
        }
        int iD = d(i10, rect, rect2);
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect3.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect3.top;
        } else if (i10 == 66) {
            i11 = rect3.right;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect3.bottom;
            i12 = rect.bottom;
        }
        return iD < Math.max(1, i11 - i12);
    }

    public static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(Rect rect, Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static int d(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public static int e(int i10, Rect rect, Rect rect2) {
        int iHeight;
        int i11;
        int iHeight2;
        if (i10 == 17) {
            iHeight = (rect.height() / 2) + rect.top;
            i11 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i10 != 33) {
                if (i10 == 66) {
                    iHeight = (rect.height() / 2) + rect.top;
                    i11 = rect2.top;
                    iHeight2 = rect2.height();
                } else if (i10 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            iHeight = (rect.width() / 2) + rect.left;
            i11 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - ((iHeight2 / 2) + i11));
    }
}
