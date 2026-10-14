package com.applovin.exoplayer2.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import com.applovin.exoplayer2.e.i.ac;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import fd.j0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.l.h, com.applovin.exoplayer2.e.l, com.applovin.exoplayer2.g.e.g.a, g6.f.a, a5.g, x5.a.InterfaceC0461a, i5.b.a, Transformer, SuccessContinuation, pb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z f4648d = new z(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z f4649e = new z(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z f4650f = new z(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z f4651g = new z(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z f4652h = new z(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z f4653i = new z(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ z f4654j = new z(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ z f4655k = new z(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ z f4656l = new z(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ z f4657m = new z(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ z f4658n = new z(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ z f4659o = new z(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ z f4660p = new z(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ z f4661q = new z(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ z f4662r = new z(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ z f4663s = new z(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ z f4664t = new z(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ z f4665u = new z(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ z f4666v = new z(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ z f4667w = new z(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ z f4668x = new z(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ z f4669y = new z(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ z f4670z = new z(22);
    public static final /* synthetic */ z A = new z(23);
    public static final /* synthetic */ z B = new z(24);
    public static final /* synthetic */ z C = new z(25);
    public static final /* synthetic */ z D = new z(26);
    public static final /* synthetic */ z E = new z(27);
    public static final /* synthetic */ z F = new z(28);
    public static final /* synthetic */ z G = new z(29);

    public /* synthetic */ z(int i10) {
        this.f4671c = i10;
    }

    @Override // a5.g
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.applovin.exoplayer2.l.h
    public void accept(Object obj) {
        switch (this.f4671c) {
            case 1:
                ((com.applovin.exoplayer2.d.g.a) obj).c();
                break;
            default:
                ((com.applovin.exoplayer2.d.g.a) obj).b();
                break;
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.f4671c) {
            case 23:
                e6.b bVar = (e6.b) obj;
                Objects.requireNonNull(bVar);
                t5.g gVar = d6.t.f28737a;
                Objects.requireNonNull(gVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gVar.a(bVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 24:
            default:
                int i10 = WidgetManualSettingsActivity.f13265f;
                j0.i((Throwable) obj, "it");
                return kc.w.f32009c;
            case 25:
                int i11 = RecordSettingsLoadActivity.f13175l;
                j0.i((Throwable) obj, "it");
                return kc.w.f32009c;
            case 26:
                int i12 = RecordSettingsLoadActivity.f13175l;
                j0.i((Throwable) obj, "it");
                return kc.w.f32009c;
            case 27:
                CombinationActivity.a aVar = CombinationActivity.f13209j;
                j0.i((Throwable) obj, "it");
                return kc.w.f32009c;
            case 28:
                int i13 = CombinedRecordingsActivity.f13231l;
                j0.i((Throwable) obj, "it");
                return kc.w.f32009c;
        }
    }

    @Override // x5.a.InterfaceC0461a
    public void b(x5.b bVar) {
        x5.a.InterfaceC0461a<Object> interfaceC0461a = a5.t.f127c;
    }

    @Override // i5.b.a
    public Object c(JsonReader jsonReader) throws IOException {
        switch (this.f4671c) {
            case 19:
                return i5.b.b(jsonReader);
            case 20:
                q5.a aVar = i5.b.f31272a;
                h5.f.b bVar = new h5.f.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    Objects.requireNonNull(strNextName);
                    if (strNextName.equals("filename")) {
                        bVar.c(jsonReader.nextString());
                    } else if (strNextName.equals("contents")) {
                        bVar.b(Base64.decode(jsonReader.nextString(), 2));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return bVar.a();
            case 21:
                q5.a aVar2 = i5.b.f31272a;
                h5.n.b bVar2 = new h5.n.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    Objects.requireNonNull(strNextName2);
                    switch (strNextName2) {
                        case "name":
                            String strNextString = jsonReader.nextString();
                            Objects.requireNonNull(strNextString, "Null name");
                            bVar2.f30847c = strNextString;
                            break;
                        case "size":
                            bVar2.f30846b = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "uuid":
                            bVar2.f30848d = new String(Base64.decode(jsonReader.nextString(), 2), h5.a0.f30712a);
                            break;
                        case "baseAddress":
                            bVar2.f30845a = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return bVar2.a();
            default:
                return i5.b.a(jsonReader);
        }
    }

    @Override // com.applovin.exoplayer2.e.l
    public com.applovin.exoplayer2.e.h[] createExtractors() {
        switch (this.f4671c) {
            case 3:
                return com.applovin.exoplayer2.e.b.b.b();
            case 4:
                return com.applovin.exoplayer2.e.e.d.h();
            case 5:
            default:
                return com.applovin.exoplayer2.e.j.a.b();
            case 6:
                return com.applovin.exoplayer2.e.g.g.f();
            case 7:
                return com.applovin.exoplayer2.e.h.c.a();
            case 8:
                return ac.d();
            case 9:
                return com.applovin.exoplayer2.e.i.e.a();
        }
    }

    @Override // g6.f.a
    public String d(Object obj) {
        switch (this.f4671c) {
            case 15:
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
            default:
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // com.applovin.exoplayer2.g.e.g.a
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        return com.applovin.exoplayer2.e.f.d.a(i10, i11, i12, i13, i14);
    }

    @Override // com.applovin.exoplayer2.g.a
    public com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
        switch (this.f4671c) {
            case 0:
                return d.a(bundle);
            case 11:
                return com.applovin.exoplayer2.h.a.a.C0093a.a(bundle);
            case 12:
                return com.applovin.exoplayer2.j.c.C0103c.a(bundle);
            case 13:
                return com.applovin.exoplayer2.j.i.a(bundle);
            default:
                return com.applovin.exoplayer2.m.b.a(bundle);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
