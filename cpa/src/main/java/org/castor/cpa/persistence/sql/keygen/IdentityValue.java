package org.castor.cpa.persistence.sql.keygen;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IdentityValue {
    Object getValue(ResultSet rs) throws SQLException;
}