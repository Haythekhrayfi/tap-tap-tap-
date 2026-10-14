package vc;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {
    public String a(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
