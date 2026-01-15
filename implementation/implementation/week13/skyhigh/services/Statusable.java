package implementation.week13.skyhigh.services;

import implementation.week13.bio.status.Status;
import implementation.week13.skyhigh.exceptions.CrashException;

public interface Statusable
{
    StatusColours checkStatus();
}