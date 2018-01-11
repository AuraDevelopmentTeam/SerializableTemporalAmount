package dev.aura.lib.sta;

import java.time.temporal.TemporalAmount;
import com.google.common.reflect.TypeToken;
import ninja.leaping.configurate.ConfigurationNode;
import ninja.leaping.configurate.objectmapping.ObjectMappingException;
import ninja.leaping.configurate.objectmapping.serialize.TypeSerializer;

public class SerializableTemporalAmountTypeSerializer implements TypeSerializer<TemporalAmount> {
  @Override
  public TemporalAmount deserialize(TypeToken<?> type, ConfigurationNode value)
      throws ObjectMappingException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void serialize(TypeToken<?> type, TemporalAmount obj, ConfigurationNode value)
      throws ObjectMappingException {
    // TODO Auto-generated method stub
    
  }
}
