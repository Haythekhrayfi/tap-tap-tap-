package f5;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.c f29370b;

    public z(String str, k5.c cVar) {
        this.f29369a = str;
        this.f29370b = cVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            c5.d dVar = c5.d.f3604c;
            StringBuilder sbA = defpackage.a.a("Error creating marker: ");
            sbA.append(this.f29369a);
            dVar.d(sbA.toString(), e10);
            return false;
        }
    }

    public final File b() {
        return this.f29370b.b(this.f29369a);
    }
}
