package sg.vp.owasp_mobile.codeinjection;


import android.util.Log;

/**
 * Created by sven on 21/6/16.
 */
public class CodeInjection {

    public CodeInjection() {

        Log.e("Code Injection Library", "Constructor called. Class name: " + CodeInjection.class.getName());
    }

    public void doSomething() {
        Log.e("Code Injection Library", "doSomething() called. Class called: " + CodeInjection.class.getName());
    }

}
