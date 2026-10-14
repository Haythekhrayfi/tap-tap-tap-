package gb;

import android.content.Context;
import android.os.Build;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import fd.g0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.ContactSupport$createInfoFile$2", f = "ContactSupport.kt", l = {234, 239}, m = "invokeSuspend")
public final class p extends oc.h implements uc.p<g0, mc.d<? super File>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f30379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f30380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f30382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, mc.d<? super p> dVar) {
        super(2, dVar);
        this.f30382h = context;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new p(this.f30382h, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super File> dVar) {
        return new p(this.f30382h, dVar).invokeSuspend(jc.w.f31842a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0151 A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:29:0x0129, B:31:0x0132, B:33:0x0151, B:36:0x0159), top: B:47:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0157  */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        File file;
        BufferedWriter bufferedWriter;
        Closeable closeable;
        BufferedWriter bufferedWriter2;
        BufferedWriter bufferedWriter3;
        File file2;
        Closeable closeable2;
        BufferedWriter bufferedWriter4;
        BufferedWriter bufferedWriter5;
        File file3;
        ActivePurchaseInfo activePurchaseInfoG;
        String string;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30381g;
        if (i10 == 0) {
            h9.d.t(obj);
            String strE = com.zipoapps.premiumhelper.util.c.e(this.f30382h);
            String strL = com.zipoapps.premiumhelper.util.c.l(this.f30382h);
            file = new File(this.f30382h.getFilesDir(), "app.txt");
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write(Build.MANUFACTURER + ' ' + Build.MODEL);
                bufferedWriter.newLine();
                bufferedWriter.write("Android " + Build.VERSION.RELEASE);
                bufferedWriter.newLine();
                bufferedWriter.write("Application: " + strE + ' ' + strL);
                bufferedWriter.newLine();
                bufferedWriter.write("PremiumHelper 4.4.2-alpha5");
                ma.h.a aVar2 = ma.h.f33410y;
                if (aVar2.a().k()) {
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.write("Configuration:");
                    bufferedWriter.newLine();
                    oa.b bVar = aVar2.a().f33418g;
                    this.f30377c = file;
                    this.f30378d = bufferedWriter;
                    this.f30379e = bufferedWriter;
                    this.f30380f = bufferedWriter;
                    this.f30381g = 1;
                    obj = bVar.e(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bufferedWriter2 = bufferedWriter;
                    bufferedWriter3 = bufferedWriter2;
                    file2 = file;
                    closeable2 = bufferedWriter3;
                } else {
                    closeable = bufferedWriter;
                }
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Purchase: ");
                activePurchaseInfoG = ma.h.f33410y.a().f33417f.g();
                if (activePurchaseInfoG != null) {
                    string = "Not purchased";
                } else {
                    string = "Not purchased";
                }
                sb2.append(string);
                bufferedWriter.write(sb2.toString());
                bufferedWriter.flush();
                y8.c0.g(closeable, null);
                return file;
            } catch (Throwable th) {
                th = th;
                closeable = bufferedWriter;
                throw th;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bufferedWriter4 = (BufferedWriter) this.f30380f;
            bufferedWriter5 = (BufferedWriter) this.f30379e;
            closeable = (Closeable) this.f30378d;
            file3 = (File) this.f30377c;
            try {
                h9.d.t(obj);
                bufferedWriter4.write((String) obj);
                bufferedWriter = bufferedWriter5;
                file = file3;
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Purchase: ");
                activePurchaseInfoG = ma.h.f33410y.a().f33417f.g();
                if (activePurchaseInfoG != null || (string = activePurchaseInfoG.toString()) == null) {
                    string = "Not purchased";
                }
                sb3.append(string);
                bufferedWriter.write(sb3.toString());
                bufferedWriter.flush();
                y8.c0.g(closeable, null);
                return file;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    y8.c0.g(closeable, th);
                    throw th3;
                }
            }
        }
        bufferedWriter2 = (BufferedWriter) this.f30380f;
        bufferedWriter3 = (BufferedWriter) this.f30379e;
        closeable2 = (Closeable) this.f30378d;
        file2 = (File) this.f30377c;
        try {
            h9.d.t(obj);
        } catch (Throwable th4) {
            th = th4;
            closeable = closeable2;
            throw th;
        }
        bufferedWriter2.write((String) obj);
        bufferedWriter3.newLine();
        bufferedWriter3.newLine();
        bufferedWriter3.write("Preferences:");
        bufferedWriter3.newLine();
        ma.f fVar = ma.h.f33410y.a().f33417f;
        this.f30377c = file2;
        this.f30378d = closeable2;
        this.f30379e = bufferedWriter3;
        this.f30380f = bufferedWriter3;
        this.f30381g = 2;
        obj = fVar.e(this);
        if (obj == aVar) {
            return aVar;
        }
        bufferedWriter4 = bufferedWriter3;
        bufferedWriter5 = bufferedWriter4;
        closeable = closeable2;
        file3 = file2;
        bufferedWriter4.write((String) obj);
        bufferedWriter = bufferedWriter5;
        file = file3;
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Purchase: ");
        activePurchaseInfoG = ma.h.f33410y.a().f33417f.g();
        if (activePurchaseInfoG != null) {
            string = "Not purchased";
        } else {
            string = "Not purchased";
        }
        sb4.append(string);
        bufferedWriter.write(sb4.toString());
        bufferedWriter.flush();
        y8.c0.g(closeable, null);
        return file;
    }
}
