package w2;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends h {
    public g(String str) {
        super(str);
    }

    @Override // w2.h
    public List<File> a(FileProvider fileProvider) {
        return b(fileProvider, this.f37087a);
    }

    @Override // w2.h
    public boolean c(File file) {
        return file.getName().equals(this.f37087a);
    }
}
