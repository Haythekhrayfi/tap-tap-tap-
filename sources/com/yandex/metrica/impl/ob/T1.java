package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.impl.ob.InterfaceC1836nh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class T1<T extends InterfaceC1836nh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15035a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f15038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f15040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, List<String>> f15041g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f15043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f15044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Long f15045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f15046l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15036b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f15037c = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15042h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f15047m = b.EMPTY;

    public enum a {
        REPORT,
        LOCATION,
        STARTUP,
        DIAGNOSTIC
    }

    public enum b {
        EMPTY,
        PENDING,
        PREPARING,
        EXECUTING,
        SUCCESS,
        FAILED,
        SHOULD_NOT_EXECUTE,
        FINISHED,
        REMOVED
    }

    public T1(T t10) {
        this.f15044j = t10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x0060  */
    /* JADX WARN: Code duplicated, block: B:53:0x006c  */
    /* JADX WARN: Code duplicated, block: B:54:0x006e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0074  */
    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    private boolean a(b... bVarArr) {
        Boolean boolValueOf;
        boolean z10;
        Boolean bool = Boolean.TRUE;
        b bVar = this.f15047m;
        int length = bVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            switch (bVarArr[i10]) {
                case EMPTY:
                    boolValueOf = null;
                    break;
                case PENDING:
                    if (bVar == b.EMPTY) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                    break;
                case PREPARING:
                case SHOULD_NOT_EXECUTE:
                    if (bVar == b.PENDING) {
                        boolValueOf = Boolean.TRUE;
                    } else if (bVar == b.REMOVED) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case EXECUTING:
                    if (bVar == b.PREPARING || bVar == b.SUCCESS || bVar == b.FAILED) {
                        boolValueOf = Boolean.TRUE;
                    } else if (bVar == b.REMOVED) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case SUCCESS:
                case FAILED:
                    if (bVar == b.EXECUTING) {
                        boolValueOf = Boolean.TRUE;
                    } else if (bVar == b.REMOVED) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case FINISHED:
                    if (bVar == b.SUCCESS || bVar == b.FAILED || bVar == b.SHOULD_NOT_EXECUTE || bVar == b.PENDING || bVar == b.PREPARING || bVar == b.EXECUTING) {
                        boolValueOf = Boolean.TRUE;
                    } else if (bVar == b.REMOVED) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case REMOVED:
                    if (bVar == b.EMPTY) {
                        boolValueOf = null;
                    } else {
                        if (bVar != b.REMOVED) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    }
                    break;
                default:
                    boolValueOf = Boolean.FALSE;
                    break;
            }
            if (true ^ Boolean.TRUE.equals(boolValueOf)) {
                bool = boolValueOf;
                Boolean bool2 = Boolean.TRUE;
                bool2.equals(bool);
                return bool2.equals(bool);
            }
        }
        Boolean bool3 = Boolean.TRUE;
        bool3.equals(bool);
        return bool3.equals(bool);
    }

    public boolean A() {
        b bVar = this.f15047m;
        return (bVar == b.REMOVED || bVar == b.FINISHED || this.f15042h + 1 >= this.f15043i.size()) ? false : true;
    }

    public String a() {
        return getClass().getName();
    }

    public void a(int i10) {
        this.f15039e = i10;
    }

    public void a(long j10) {
        this.f15045k = Long.valueOf(j10);
        this.f15046l = Integer.valueOf(C1694i.a(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    public abstract void a(Uri.Builder builder);

    public void a(String str, String... strArr) {
        this.f15037c.put(str, Arrays.asList(strArr));
    }

    public final void a(Throwable th) {
        b bVar = b.FAILED;
        if (a(bVar)) {
            b(th);
            this.f15047m = bVar;
        }
    }

    public void a(List<String> list) {
        this.f15043i = list;
    }

    public void a(byte[] bArr) {
        this.f15036b = 2;
        this.f15038d = bArr;
    }

    public abstract a b();

    public abstract void b(Throwable th);

    public void b(byte[] bArr) {
        this.f15040f = bArr;
    }

    public List<String> c() {
        return this.f15043i;
    }

    public Vd d() {
        return new Wd(this.f15035a);
    }

    public int e() {
        return this.f15036b;
    }

    public Map<String, List<String>> f() {
        return this.f15037c;
    }

    public byte[] g() {
        return this.f15038d;
    }

    public int h() {
        return this.f15039e;
    }

    public byte[] i() {
        return this.f15040f;
    }

    public Ci j() {
        return null;
    }

    public Long k() {
        return this.f15045k;
    }

    public Integer l() {
        return this.f15046l;
    }

    public boolean m() {
        return this.f15039e == 400;
    }

    public final boolean n() {
        b bVar = b.PREPARING;
        if (!a(bVar)) {
            return false;
        }
        this.f15047m = bVar;
        return o();
    }

    public abstract boolean o();

    public boolean p() {
        b bVar = b.EXECUTING;
        if (!a(bVar)) {
            return false;
        }
        this.f15047m = bVar;
        int i10 = this.f15042h + 1;
        this.f15042h = i10;
        Uri.Builder builderBuildUpon = Uri.parse(this.f15043i.get(i10)).buildUpon();
        a(builderBuildUpon);
        this.f15035a = builderBuildUpon.build().toString();
        return true;
    }

    public final boolean q() {
        b bVar = b.SUCCESS;
        b bVar2 = b.FAILED;
        if (!a(bVar, bVar2)) {
            return false;
        }
        boolean zR = r();
        if (zR) {
            this.f15047m = bVar;
        } else {
            this.f15047m = bVar2;
        }
        return zR;
    }

    public abstract boolean r();

    public void s() {
        b bVar = b.SHOULD_NOT_EXECUTE;
        if (a(bVar)) {
            this.f15047m = bVar;
        }
    }

    public abstract void t();

    public final boolean u() {
        b bVar = b.PENDING;
        if (!a(bVar)) {
            return false;
        }
        boolean zV = v();
        this.f15047m = bVar;
        return zV;
    }

    public boolean v() {
        return true;
    }

    public void w() {
        b bVar = b.FINISHED;
        if (a(bVar)) {
            b bVar2 = this.f15047m;
            if (bVar2 == b.SUCCESS) {
                t();
            } else if (bVar2 == b.FAILED || bVar2 == b.SHOULD_NOT_EXECUTE) {
                y();
            }
            this.f15047m = bVar;
        }
    }

    public void x() {
        b bVar = b.REMOVED;
        if (a(bVar)) {
            this.f15047m = bVar;
        }
    }

    public void y() {
    }

    public boolean z() {
        return false;
    }
}
