package com.whiterabbit.postmanlibsample.com.whiterabbit.postmanlibsample.commands;

import android.content.Context;
import android.os.Parcel;
import com.whiterabbit.postman.commands.RestServerCommand;
import com.whiterabbit.postman.commands.ResultParseException;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Verb;

/**
 * Created with IntelliJ IDEA.
 * User: fedepaol
 * Date: 12/18/12
 * Time: 12:41 AM
 */
public class TwitterGetLatestTweetCommand extends RestServerCommand {
    private static final String url = "https://api.twitter.com/1.1/statuses/home_timeline.json";


    public TwitterGetLatestTweetCommand(){
        super(Verb.GET, url);
    }

    @Override
    protected void processHttpResult(String result, Context context) throws ResultParseException {
        //TODO Autogenerated
    }

    @Override
    protected void addParamsToRequest(OAuthRequest request) {
        request.addQuerystringParameter("count", "1");
    }

    @Override
    public int describeContents() {
        return 0;  //TODO Autogenerated
    }



    public static final Creator<TwitterGetLatestTweetCommand> CREATOR
            = new Creator<TwitterGetLatestTweetCommand>() {
        public TwitterGetLatestTweetCommand createFromParcel(Parcel in) {
            return new TwitterGetLatestTweetCommand(in);
        }

        public TwitterGetLatestTweetCommand[] newArray(int size) {
            return new TwitterGetLatestTweetCommand[size];
        }
    };


    public TwitterGetLatestTweetCommand(Parcel in){
        super(in);
    }

}