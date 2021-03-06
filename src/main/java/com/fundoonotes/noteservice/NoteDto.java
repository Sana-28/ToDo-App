package com.fundoonotes.noteservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class NoteDto
{
   private int noteId;
   private String title;
   private String description;
   private Date date;
   private Boolean inTrash;
   private Boolean isPin;
   private Boolean isArchive;
   private String color;
   private Date reminder;
   private List<LabelDto> labels = new ArrayList();
   private List<CollaboratorDtoRes> collaborators = new ArrayList();
   
   private byte[] noteImage;

   public NoteDto(Note noteObj)
   {
      this.noteId = noteObj.getnoteId();
      this.title = noteObj.getTitle();
      this.description = noteObj.getDescription();
      this.date = noteObj.getDate();
      this.inTrash = noteObj.getInTrash();
      this.isPin = noteObj.getIsPin();
      this.isArchive = noteObj.getIsArchive();
      this.color = noteObj.getColor();
      this.reminder = noteObj.getReminder();
      this.noteImage=noteObj.getNoteImage();

      for (Label labelObj : noteObj.getLabel()) {
         labels.add(new LabelDto(labelObj));
      }

      for (Collaborator collObj : noteObj.getCollaborators()) {
         collaborators.add(new CollaboratorDtoRes(collObj));
      }
   }

   public int getNoteId()
   {
      return noteId;
   }

   public void setNoteId(int noteId)
   {
      this.noteId = noteId;
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public Date getDate()
   {
      return date;
   }

   public void setDate(Date date)
   {
      this.date = date;
   }

   public Boolean getInTrash()
   {
      return inTrash;
   }

   public void setInTrash(Boolean inTrash)
   {
      this.inTrash = inTrash;
   }

   public Boolean getIsPin()
   {
      return isPin;
   }

   public void setIsPin(Boolean isPin)
   {
      this.isPin = isPin;
   }

   public Boolean getIsArchive()
   {
      return isArchive;
   }

   public void setIsArchive(Boolean isArchive)
   {
      this.isArchive = isArchive;
   }

   public String getColor()
   {
      return color;
   }

   public void setColor(String color)
   {
      this.color = color;
   }

   public Date getReminder()
   {
      return reminder;
   }

   public void setReminder(Date reminder)
   {
      this.reminder = reminder;
   }

   public List<LabelDto> getLabels()
   {
      return labels;
   }

   public void setLabels(List<LabelDto> labels)
   {
      this.labels = labels;
   }

   public List<CollaboratorDtoRes> getCollaborators()
   {
      return collaborators;
   }

   public void setCollaborators(List<CollaboratorDtoRes> collaborators)
   {
      this.collaborators = collaborators;
   }

   public byte[] getNoteImage()
   {
      return noteImage;
   }

   public void setNoteImage(byte[] noteImage)
   {
      this.noteImage = noteImage;
   }
}
