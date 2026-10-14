package ne;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f33837f = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient se.f f33839e;

    public s(String str, se.f fVar) {
        this.f33838d = str;
        this.f33839e = fVar;
    }

    public static s k(String str, boolean z10) {
        if (str.length() < 2 || !f33837f.matcher(str).matches()) {
            throw new a(i.f.a("Invalid ID for region-based ZoneId, invalid format: ", str));
        }
        se.f fVarH = null;
        try {
            fVarH = se.i.a(str, true);
        } catch (se.g e10) {
            if (str.equals("GMT0")) {
                fVarH = r.f33832h.h();
            } else if (z10) {
                throw e10;
            }
        }
        return new s(str, fVarH);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 7, this);
    }

    @Override // ne.q
    public String g() {
        return this.f33838d;
    }

    @Override // ne.q
    public se.f h() {
        se.f fVar = this.f33839e;
        return fVar != null ? fVar : se.i.a(this.f33838d, false);
    }

    @Override // ne.q
    public void j(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f33838d);
    }
}
