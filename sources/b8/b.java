package b8;

import android.content.res.Resources;
import android.util.TypedValue;
import fd.j0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Boolean> f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Float> f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f3353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f3354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f3355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Resources resources) {
        super(resources);
        j0.i(resources, "baseResources");
        this.f3350b = new ConcurrentHashMap<>();
        this.f3351c = new ConcurrentHashMap<>();
        this.f3352d = new ConcurrentHashMap<>();
        this.f3353e = new ConcurrentHashMap<>();
        this.f3354f = new ConcurrentHashMap<>();
        this.f3355g = new TypedValue();
        this.f3356h = new Object();
    }

    public final TypedValue a() {
        TypedValue typedValue;
        synchronized (this.f3356h) {
            typedValue = this.f3355g;
            if (typedValue != null) {
                this.f3355g = null;
            } else {
                typedValue = null;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    public final void b(TypedValue typedValue) {
        synchronized (this.f3356h) {
            if (this.f3355g == null) {
                this.f3355g = typedValue;
            }
        }
    }

    @Override // b8.c, android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.f3350b;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i10));
        if (bool == null) {
            TypedValue typedValueA = a();
            try {
                boolean z10 = true;
                this.f3357a.getValue(i10, typedValueA, true);
                int i11 = typedValueA.type;
                if (!(i11 >= 16 && i11 <= 31)) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i10)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                if (typedValueA.data == 0) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), boolValueOf);
                }
                b(typedValueA);
                bool = boolValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return bool.booleanValue();
    }

    @Override // b8.c, android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.f3351c;
        Float f10 = concurrentHashMap.get(Integer.valueOf(i10));
        if (f10 == null) {
            TypedValue typedValueA = a();
            try {
                boolean z10 = true;
                this.f3357a.getValue(i10, typedValueA, true);
                if (typedValueA.type != 5) {
                    z10 = false;
                }
                if (!z10) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i10)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Float fValueOf = Float.valueOf(TypedValue.complexToDimension(typedValueA.data, getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), fValueOf);
                }
                b(typedValueA);
                f10 = fValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return f10.floatValue();
    }

    @Override // b8.c, android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f3352d;
        Integer num = concurrentHashMap.get(Integer.valueOf(i10));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                boolean z10 = true;
                this.f3357a.getValue(i10, typedValueA, true);
                if (typedValueA.type != 5) {
                    z10 = false;
                }
                if (!z10) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i10)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(typedValueA.data, getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // b8.c, android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f3353e;
        Integer num = concurrentHashMap.get(Integer.valueOf(i10));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                boolean z10 = true;
                this.f3357a.getValue(i10, typedValueA, true);
                if (typedValueA.type != 5) {
                    z10 = false;
                }
                if (!z10) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i10)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValueA.data, getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // b8.c, android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f3354f;
        Integer num = concurrentHashMap.get(Integer.valueOf(i10));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                boolean z10 = true;
                this.f3357a.getValue(i10, typedValueA, true);
                int i11 = typedValueA.type;
                if (i11 < 16 || i11 > 31) {
                    z10 = false;
                }
                if (!z10) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i10)) + " type #0x" + ((Object) Integer.toHexString(typedValueA.type)) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(typedValueA.data);
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return num.intValue();
    }
}
