package SpartJavaSample;

import spark.Request;
import spark.Response;

import java.util.Map;

public class TokenController implements Controllable
{
    @Override
    public boolean get(Request request, Response response, Map<String, Object> model)
    {
        //return null; // TODO: Do work

        return true;
    }
}
