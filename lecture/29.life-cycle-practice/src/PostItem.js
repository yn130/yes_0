import React from 'react'
import './PostItem.css'

export default function PostItem(props) {
    const { post } = props;

    return (
      <div className="PostItem">
        <div className='title-idContainer'>
          <span className="id">No. {post.id}</span>
          <span className="title">- {post.title}</span>
        </div>
        <p className="body">{post.body.slice(0, 120)}...</p>
      </div>
    );
  };
