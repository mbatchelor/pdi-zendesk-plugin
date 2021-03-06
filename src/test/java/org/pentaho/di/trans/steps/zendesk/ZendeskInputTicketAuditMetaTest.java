/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.steps.zendesk;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.trans.steps.loadsave.LoadSaveTester;


public class ZendeskInputTicketAuditMetaTest {

  @BeforeClass
  public static void setUpBeforeClass() throws KettleException {
    KettleEnvironment.init( false );
  }

  @Test
  public void testRoundTrip() throws KettleException {
    List<String> attributes =
      Arrays.asList( "subDomain", "username", "password", "token", "ticketIdFieldname", "auditIdFieldname",
        "auditRownumFieldname", "createdTimeFieldname", "organizationIdFieldname", "requesterIdFieldname",
        "assigneeIdFieldname", "groupIdFieldname", "subjectFieldname", "tagsFieldname", "collaboratorsFieldname",
        "statusFieldname", "priorityFieldname", "channelFieldname", "typeFieldname", "satisfactionFieldname",
        "localeFieldname", "dueAtFieldname", "satisfactionCommentFieldname", "formIdFieldname", "brandIdFieldname",
        "commentIdFieldname", "authorIdFieldname", "publicCommentFieldname", "commentBodyFieldname",
        "commentHTMLBodyFieldname", "changedToPrivateFieldname", "customFieldFieldname", "customFieldValueFieldname",
        "ticketOverviewStepName", "ticketCommentsStepName", "ticketCustomFieldsStepName", "ticketTagsStepName" );

    LoadSaveTester loadSaveTester =
      new LoadSaveTester( ZendeskInputTicketAuditMeta.class, attributes, new HashMap<String, String>(),
        new HashMap<String, String>() );

    loadSaveTester.testRepoRoundTrip();
    loadSaveTester.testXmlRoundTrip();
  }

  @Test
  public void testDefault() {
    ZendeskInputTicketAuditMeta meta = new ZendeskInputTicketAuditMeta();
    meta.setDefault();
    assertNull( meta.getTicketIdFieldname() );
    assertNotNull( meta.getAuditIdFieldname() );
    assertNotNull( meta.getAuditRownumFieldname() );
    assertNotNull( meta.getCreatedTimeFieldname() );
    assertNotNull( meta.getOrganizationIdFieldname() );
    assertNotNull( meta.getRequesterIdFieldname() );
    assertNotNull( meta.getAssigneeIdFieldname() );
    assertNotNull( meta.getGroupIdFieldname() );
    assertNotNull( meta.getSubjectFieldname() );
    assertNotNull( meta.getTagsFieldname() );
    assertNotNull( meta.getCollaboratorsFieldname() );
    assertNotNull( meta.getStatusFieldname() );
    assertNotNull( meta.getPriorityFieldname() );
    assertNotNull( meta.getChannelFieldname() );
    assertNotNull( meta.getTypeFieldname() );
    assertNotNull( meta.getSatisfactionFieldname() );
    assertNotNull( meta.getLocaleFieldname() );
    assertNotNull( meta.getDueAtFieldname() );
    assertNotNull( meta.getSatisfactionCommentFieldname() );
    assertNotNull( meta.getFormIdFieldname() );
    assertNotNull( meta.getCommentIdFieldname() );
    assertNotNull( meta.getAuthorIdFieldname() );
    assertNotNull( meta.getPublicCommentFieldname() );
    assertNotNull( meta.getCommentBodyFieldname() );
    assertNotNull( meta.getCommentHTMLBodyFieldname() );
    assertNotNull( meta.getChangedToPrivateFieldname() );
    assertNotNull( meta.getCustomFieldFieldname() );
    assertNotNull( meta.getCustomFieldValueFieldname() );
  }
}
