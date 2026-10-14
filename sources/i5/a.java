package i5;

import android.util.JsonReader;
import android.view.ViewGroup;
import b9.o;
import com.applovin.exoplayer2.b.z;
import com.google.android.datatransport.Transformer;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import fd.j0;
import h5.a0;
import h5.q;
import h9.e;
import h9.m;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import kc.w;
import p7.y0;
import pb.c;
import t9.i;
import t9.j;
import t9.s;
import t9.u;
import u9.f;
import y9.g;
import y9.h;
import y9.l;
import y9.n;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements b.a, Transformer, c, y0.a, j, o, m, h9.c.a, s.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f31248d = new a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f31249e = new a(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f31250f = new a(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f31251g = new a(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f31252h = new a(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f31253i = new a(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f31254j = new a(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a f31255k = new a(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a f31256l = new a(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a f31257m = new a(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a f31258n = new a(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a f31259o = new a(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a f31260p = new a(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a f31261q = new a(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a f31262r = new a(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a f31263s = new a(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a f31264t = new a(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a f31265u = new a(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a f31266v = new a(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a f31267w = new a(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a f31268x = new a(27);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a f31269y = new a(28);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a f31270z = new a(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31271c;

    public /* synthetic */ a(int i10) {
        this.f31271c = i10;
    }

    @Override // t9.j
    public u.a a(ViewGroup viewGroup, j.b bVar, j.a aVar) {
        return new i(viewGroup, bVar, aVar);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.f31271c) {
            case 3:
                return l5.a.f32209c.h((a0) obj).getBytes(Charset.forName("UTF-8"));
            case 4:
                int i10 = ManualSettingsLoadActivity.f13134n;
                j0.i((Throwable) obj, "it");
                return w.f32009c;
            case 5:
                int i11 = ManualSettingsLoadActivity.f13134n;
                j0.i((Throwable) obj, "it");
                return w.f32009c;
            default:
                int i12 = WidgetRecordSettingsActivity.f13283g;
                j0.i((Throwable) obj, "it");
                return w.f32009c;
        }
    }

    @Override // h9.c.a
    public void b(f fVar) {
    }

    @Override // i5.b.a
    public Object c(JsonReader jsonReader) throws IOException {
        switch (this.f31271c) {
            case 0:
                return b.d(jsonReader);
            case 1:
                q5.a aVar = b.f31272a;
                q.b bVar = new q.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    Objects.requireNonNull(strNextName);
                    switch (strNextName) {
                        case "frames":
                            bVar.f30870c = b.c(jsonReader, z.f4670z);
                            break;
                        case "name":
                            String strNextString = jsonReader.nextString();
                            Objects.requireNonNull(strNextString, "Null name");
                            bVar.f30868a = strNextString;
                            break;
                        case "importance":
                            bVar.f30869b = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return bVar.a();
            default:
                return b.a(jsonReader);
        }
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f31271c) {
            case 11:
                m<?> mVar = h9.c.f30971a;
                return true;
            case 12:
            case 16:
            default:
                long jLongValue = ((Long) obj).longValue();
                n.f fVar = n.f41577e;
                return jLongValue >= 0;
            case 13:
                j0.i(obj, "it");
                return true;
            case 14:
                m<String> mVar2 = e.f30977a;
                return !((String) obj).isEmpty();
            case 15:
                String str = (String) obj;
                j0.i(str, "it");
                return str.length() > 0;
            case 17:
                String str2 = (String) obj;
                y9.a.C0470a c0470a = y9.a.f38962c;
                j0.i(str2, "it");
                return str2.length() >= 1;
            case 18:
                String str3 = (String) obj;
                m<String> mVar3 = y9.c.f39336c;
                j0.i(str3, "it");
                return str3.length() >= 1;
            case 19:
                String str4 = (String) obj;
                y9.e.a aVar = y9.e.f39722c;
                j0.i(str4, "it");
                return str4.length() >= 1;
            case 20:
                String str5 = (String) obj;
                m<String> mVar4 = y9.f.f39910c;
                j0.i(str5, "it");
                return str5.length() >= 1;
            case 21:
                String str6 = (String) obj;
                g.a aVar2 = g.f40072c;
                j0.i(str6, "it");
                return str6.length() >= 1;
            case 22:
                String str7 = (String) obj;
                m<String> mVar5 = h.f40244c;
                j0.i(str7, "it");
                return str7.length() >= 1;
            case 23:
                long jLongValue2 = ((Long) obj).longValue();
                l.b bVar = l.f41153e;
                return jLongValue2 >= 0;
            case 24:
                long jLongValue3 = ((Long) obj).longValue();
                l.b bVar2 = l.f41153e;
                return jLongValue3 >= 0;
            case 25:
                long jLongValue4 = ((Long) obj).longValue();
                l.b bVar3 = l.f41153e;
                return jLongValue4 >= 0;
            case 26:
                long jLongValue5 = ((Long) obj).longValue();
                l.b bVar4 = l.f41153e;
                return jLongValue5 >= 0;
            case 27:
                long jLongValue6 = ((Long) obj).longValue();
                n.f fVar2 = n.f41577e;
                return jLongValue6 >= 0;
            case 28:
                long jLongValue7 = ((Long) obj).longValue();
                n.f fVar3 = n.f41577e;
                return jLongValue7 >= 0;
        }
    }

    @Override // b9.o
    public boolean e(String str) {
        o.a aVar = o.a.f3395a;
        return true;
    }

    @Override // p7.y0.a
    public void f(boolean z10) {
        y0.a aVar = y0.f34605d;
    }

    @Override // t9.s.a
    public int h() {
        int i10 = s.f35845m;
        return Integer.MAX_VALUE;
    }
}
