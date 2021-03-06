/*
 * Copyright 2010-2011 LinkedIn Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 
 */
package com.linkedin.bowser.core.objects;

import com.linkedin.bowser.core.expn.Type;

public class BooleanObject extends NQLObject implements Numeric
{
  private final boolean _value;

  public BooleanObject(boolean value)
  {
    super();
    _value = value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsInt()
   */
  @Override
  public int getAsInt()
  {
    return _value ? 1 : 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsFloat()
   */
  @Override
  public float getAsFloat()
  {
    return getAsInt();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsLong()
   */
  @Override
  public long getAsLong()
  {
    return getAsInt();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsBoolean()
   */
  @Override
  public boolean getAsBoolean()
  {
    return _value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.BOOLEAN;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return _value ? "True" : "False";
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + (_value ? 1231 : 1237);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BooleanObject other = (BooleanObject) obj;
    if (_value != other._value)
      return false;
    return true;
  }

}
