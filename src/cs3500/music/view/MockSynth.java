package cs3500.music.view;

import java.util.List;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Patch;
import javax.sound.midi.Receiver;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Transmitter;
import javax.sound.midi.VoiceStatus;

/**
 * Class to represent a mock synth
 */
public class MockSynth implements MidiDevice, Synthesizer {

  StringBuilder log;

  public MockSynth(StringBuilder log) {
    this.log = log;
  }

  @Override
  public Info getDeviceInfo() {
    return null;
  }

  @Override
  public void open() throws MidiUnavailableException {

  }

  @Override
  public void close() {

  }

  @Override
  public boolean isOpen() {
    return false;
  }

  @Override
  public long getMicrosecondPosition() {
    return 0;
  }

  @Override
  public int getMaxReceivers() {
    return 0;
  }

  @Override
  public int getMaxTransmitters() {
    return 0;
  }

  @Override
  public Receiver getReceiver() {
    return new MockReceiver(log);
  }

  @Override
  public List<Receiver> getReceivers() {
    return null;
  }

  @Override
  public Transmitter getTransmitter() throws MidiUnavailableException {
    return null;
  }

  @Override
  public List<Transmitter> getTransmitters() {
    return null;
  }

  @Override
  public int getMaxPolyphony() {
    return 0;
  }

  @Override
  public long getLatency() {
    return 0;
  }

  @Override
  public MidiChannel[] getChannels() {
    return new MidiChannel[0];
  }

  @Override
  public VoiceStatus[] getVoiceStatus() {
    return new VoiceStatus[0];
  }

  @Override
  public boolean isSoundbankSupported(Soundbank soundbank) {
    return false;
  }

  @Override
  public boolean loadInstrument(Instrument instrument) {
    return false;
  }

  @Override
  public void unloadInstrument(Instrument instrument) {

  }

  @Override
  public boolean remapInstrument(Instrument from, Instrument to) {
    return false;
  }

  @Override
  public Soundbank getDefaultSoundbank() {
    return null;
  }

  @Override
  public Instrument[] getAvailableInstruments() {
    return new Instrument[0];
  }

  @Override
  public Instrument[] getLoadedInstruments() {
    return new Instrument[0];
  }

  @Override
  public boolean loadAllInstruments(Soundbank soundbank) {
    return false;
  }

  @Override
  public void unloadAllInstruments(Soundbank soundbank) {

  }

  @Override
  public boolean loadInstruments(Soundbank soundbank, Patch[] patchList) {
    return false;
  }

  @Override
  public void unloadInstruments(Soundbank soundbank, Patch[] patchList) {

  }
}
