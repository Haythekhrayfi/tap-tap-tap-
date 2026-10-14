package w2;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f37088b;

    public i(String str) {
        super(str);
        this.f37088b = Pattern.compile(str);
    }

    @Override // w2.h
    public List<File> a(FileProvider fileProvider) {
        return b(fileProvider, ".");
    }

    @Override // w2.h
    public boolean c(File file) {
        return this.f37088b.matcher(file.getName()).find();
    }
}
