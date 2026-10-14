package m0;

import com.applovin.impl.sdk.utils.w;
import h5.a0;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f33125d = new d(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d f33126e = new d(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d f33127f = new d(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d f33128g = new d(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d f33129h = new d(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d f33130i = new d(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33131c;

    public /* synthetic */ d(int i10) {
        this.f33131c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int length2;
        switch (this.f33131c) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int i10 = e.f33132a;
                if (bArr.length == bArr2.length) {
                    for (int i11 = 0; i11 < bArr.length; i11++) {
                        if (bArr[i11] != bArr2[i11]) {
                            length = bArr[i11];
                            length2 = bArr2[i11];
                        }
                    }
                    return 0;
                }
                length = bArr.length;
                length2 = bArr2.length;
                return length - length2;
            case 1:
                return com.applovin.exoplayer2.g.f.c.a.a((com.applovin.exoplayer2.g.f.c.a) obj, (com.applovin.exoplayer2.g.f.c.a) obj2);
            case 2:
                return com.applovin.exoplayer2.j.c.b((Integer) obj, (Integer) obj2);
            case 3:
                return w.c((String) obj, (String) obj2);
            case 4:
                return ((a0.c) obj).a().compareTo(((a0.c) obj2).a());
            default:
                Charset charset = k5.b.f31897d;
                String name = ((File) obj).getName();
                int i12 = k5.b.f31898e;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
        }
    }
}
