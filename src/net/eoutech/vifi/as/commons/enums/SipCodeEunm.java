package net.eoutech.vifi.as.commons.enums;

/**
 * Created by Administrator on 2015/9/19.
 */

public enum SipCodeEunm {

    SIP_110_HOLD_ON( -110 ),

    SIP_100_TRYING( 100 ),
    SIP_180_RINGING( 180 ),
    SIP_181_CALL_IS_BEING_FORWARDED( 181 ),
    SIP_182_QUEUED( 182 ),
    SIP_183_SESSION_PROGRESS( 183 ),
    SIP_200_OK( 200 ),
    SIP_202_ACCEPTED( 202 ),
    SIP_300_MULTIPLE_CHOICES( 300 ),
    SIP_301_MOVED_PERMANENTLY( 301 ),
    SIP_302_MOVED_TEMPORARILY( 302 ),
    SIP_305_USE_PROXY( 305 ),
    SIP_380_ALTERNATIVE_SERVICE( 380 ),
    SIP_400_BAD_REQUEST( 400 ),
    SIP_401_UNAUTHORIZED( 401 ),
    SIP_402_USER_PAYMENT_NOT_ENOUGH( 402 ),
    SIP_402_AGENT_PAYMENT_NOT_ENOUGH( 402 ),
    SIP_403_FORBIDDEN( 403 ),
    SIP_403_NO_PERMISSION( 403 ),
    SIP_403_USER_OUTOF_MAXDATA( 403 ),
    SIP_404_NOT_FOUND( 404 ),
    SIP_404_NOT_FOUND_RATE( 404 ),
    SIP_404_DEVICE_NOT_BIND_USER( 404 ),
    SIP_404_USER_OFFLINE ( 404 ) ,
    SIP_404_UNBIND_GOIP ( 404 ),
    SIP_404_NOT_FOUND_ROUTE( 404 ),
    SIP_405_METHOD_NOT_ALLOWED( 405 ),
    SIP_406_NOT_ACCEPTABLE( 406 ),
    SIP_407_PROXY_AUTHENTICATION_REQUIRED( 407 ),
    SIP_408_REQUEST_TIME_OUT( 408 ),
    SIP_410_GONE( 410 ),
    SIP_413_REQUEST_ENTITY_TOO_LARGE( 413 ),
    SIP_414_REQUEST_URI_TOO_LARGE( 414 ),
    SIP_415_UNSUPPORTED_MEDIA_TYPE( 415 ),
    SIP_416_UNSUPPORTED_URI_SCHEME( 416 ),
    SIP_420_BAD_EXTENSION( 420 ),
    SIP_421_EXTENSION_REQUIRED( 421 ),
    SIP_422_SESSION_INTERVAL_TOO_SMALL( 422 ),
    SIP_423_INTERVAL_TOO_BRIEF( 423 ),
    SIP_480_TEMPORARILY_UNAVAILABLE( 480 ),
    SIP_481_CALL_TRANSACTION_DOES_NOT_EXIST( 481 ),
    SIP_482_LOOP_DETECTED( 482 ),
    SIP_483_TOO_MANY_HOPS( 483 ),
    SIP_484_ADDRESS_INCOMPLETE( 484 ),
    SIP_485_AMBIGUOUS( 485 ),
    SIP_486_BUSY_HERE( 486 ),
    SIP_487_REQUEST_TERMINATED( 487 ),
    SIP_488_NOT_ACCEPTABLE_HERE( 488 ),
    SIP_489_BAD_EVENT( 489 ),
    SIP_491_REQUEST_PENDING( 491 ),
    SIP_493_UNDECIPHERABLE( 493 ),
    SIP_500_INTERNAL_SERVER_ERROR( 500 ),
    SIP_501_NOT_IMPLEMENTED( 501 ),
    SIP_502_BAD_GATEWAY( 502 ),
    SIP_503_SERVICE_UNAVAILABLE( 503 ),
    SIP_504_SERVER_TIME_OUT( 504 ),
    SIP_505_VERSION_NOT_SUPPORTED( 505 ),
    SIP_513_MESSAGE_TOO_LARGE( 513 ),
    SIP_600_BUSY_EVRYWHERE( 600 ),
    SIP_603_DECLINE( 603 ),
    SIP_604_DOES_NOT_EXIST_ANYWHERE( 604 ),
    SIP_606_NOT_ACCEPTABLE( 606 ),

    SESSION_400_BAD_REQUEST( 400 ),
    SESSION_404_NOT_FOUND( 404 ),
    SESSION_408_TIMEOUT( 408 ),
    SESSION_403_CLOSED( 403 ),

    SESSION_404_UUDEVICE_NOT_FOUND( 404 ),
    SESSION_403_UUDEVICE_STATE_DISABLE( 403 ),

    SESSION_404_VSW_NOT_FOUND( 404 ),
    SESSION_403_VSW_OFFLINE( 403 ),

    SESSION_404_GSDEV_NOT_FOUND( 404 ),
    SESSION_403_GSDEV_OFFLINE( 403 ),

    SESSION_404_GSPORT_NOT_FOUND( 404 ),
    SESSION_403_GSPORT_NO_SIMCARD( 403 ),
    SESSION_403_GSPORT_BIND_OTHER_VID( 403 ),

    SESSION_404_SIMCARD_NOT_FOUND( 404 ),
    SESSION_403_SIMCARD_DISABLE( 403 ),

    SESSION_404_SCGROUP_NOT_FOUND( 404 ),
    SESSION_403_SCGROUP_AREACODE_ISNULL( 403 ),

    COST_404_USER_NOT_FOUND ( 404 ),
    COST_404_RATE_NOT_FOUND ( 404 );

    public int code;
    public String desc;

    SipCodeEunm( int code ) {
        this.code = code;
        this.desc = this.toString();
    }
}