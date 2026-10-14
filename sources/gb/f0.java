package gb;

import com.developer.filepicker.model.DialogConfigs;
import fd.g0;
import fd.j0;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Zip$zipFiles$2", f = "Zip.kt", l = {}, m = "invokeSuspend")
public final class f0 extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f30205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String str, List<String> list, mc.d<? super f0> dVar) {
        super(2, dVar);
        this.f30204c = str;
        this.f30205d = list;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new f0(this.f30204c, this.f30205d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        f0 f0Var = new f0(this.f30204c, this.f30205d, dVar);
        jc.w wVar = jc.w.f31842a;
        f0Var.invokeSuspend(wVar);
        return wVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(this.f30204c));
        try {
            byte[] bArr = new byte[8192];
            for (String str : this.f30205d) {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    String strSubstring = str.substring(ed.u.H(str, DialogConfigs.DIRECTORY_SEPERATOR, 0, false, 6) + 1);
                    j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                    zipOutputStream.putNextEntry(new ZipEntry(strSubstring));
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (-1 == i10) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i10);
                    }
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    y8.c0.g(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        y8.c0.g(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            zipOutputStream.finish();
            zipOutputStream.flush();
            zipOutputStream.close();
            jc.w wVar = jc.w.f31842a;
            y8.c0.g(zipOutputStream, null);
            return wVar;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                y8.c0.g(zipOutputStream, th3);
                throw th4;
            }
        }
    }
}
