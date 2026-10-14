package bd;

import java.util.NoSuchElementException;
import kc.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3521f;

    public b(int i10, int i11, int i12) {
        this.f3518c = i12;
        this.f3519d = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f3520e = z10;
        this.f3521f = z10 ? i10 : i11;
    }

    @Override // kc.c0
    public int a() {
        int i10 = this.f3521f;
        if (i10 != this.f3519d) {
            this.f3521f = this.f3518c + i10;
        } else {
            if (!this.f3520e) {
                throw new NoSuchElementException();
            }
            this.f3520e = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3520e;
    }
}
