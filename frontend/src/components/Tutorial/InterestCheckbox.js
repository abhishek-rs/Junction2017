import React from 'react';
import Checkbox from 'material-ui/Checkbox';
import ActionFavorite from 'material-ui/svg-icons/action/favorite';
import ActionFavoriteBorder from 'material-ui/svg-icons/action/favorite-border';

const styles = {
  block: {
    maxWidth: 250,
  },
  checkbox: {
    marginLeft: 16,
    color: 'white !important',
  },
};

class InterestCheckbox extends React.Component {
constructor(props){
  super(props);
  this.handleCheck = this.handleCheck.bind(this)
}

  handleCheck(){
    this.props.onCheck(this.props.title);
  }

  render() {
    return (
      <div style={styles.block}>
        <Checkbox
          onCheck={this.handleCheck}
          checkedIcon={<ActionFavorite />}
          uncheckedIcon={<ActionFavoriteBorder />}
          style={styles.checkbox}
          labelStyle={{color: 'white'}} iconStyle={{fill: 'white'}}
        />
      </div>
    );
  }
}

export default InterestCheckbox;
